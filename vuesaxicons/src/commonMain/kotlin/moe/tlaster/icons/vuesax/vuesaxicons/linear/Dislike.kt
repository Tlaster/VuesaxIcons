package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.52f, 5.65f)
                lineTo(13.42f, 3.25f)
                curveTo(13.02f, 2.85f, 12.12f, 2.65f, 11.52f, 2.65f)
                horizontalLineTo(7.72f)
                curveTo(6.52f, 2.65f, 5.22f, 3.55f, 4.92f, 4.75f)
                lineTo(2.52f, 12.05f)
                curveTo(2.02f, 13.45f, 2.92f, 14.65f, 4.42f, 14.65f)
                horizontalLineTo(8.42f)
                curveTo(9.02f, 14.65f, 9.52f, 15.15f, 9.42f, 15.85f)
                lineTo(8.92f, 19.05f)
                curveTo(8.72f, 19.95f, 9.32f, 20.95f, 10.22f, 21.25f)
                curveTo(11.02f, 21.55f, 12.02f, 21.15f, 12.42f, 20.55f)
                lineTo(16.52f, 14.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.62f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(21.62f, 16.85f, 21.02f, 17.35f, 19.62f, 17.35f)
                horizontalLineTo(18.62f)
                curveTo(17.22f, 17.35f, 16.62f, 16.85f, 16.62f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(16.62f, 4.25f, 17.22f, 3.75f, 18.62f, 3.75f)
                horizontalLineTo(19.62f)
                curveTo(21.02f, 3.75f, 21.62f, 4.25f, 21.62f, 5.65f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
