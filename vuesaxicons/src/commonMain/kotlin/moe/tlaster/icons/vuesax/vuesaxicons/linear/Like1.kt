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

public val LinearGroup.Like1: ImageVector
    get() {
        if (_like1 != null) {
            return _like1!!
        }
        _like1 = Builder(name = "Like1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.48f, 18.35f)
                lineTo(10.58f, 20.75f)
                curveTo(10.98f, 21.15f, 11.88f, 21.35f, 12.48f, 21.35f)
                horizontalLineTo(16.28f)
                curveTo(17.48f, 21.35f, 18.78f, 20.45f, 19.08f, 19.25f)
                lineTo(21.48f, 11.95f)
                curveTo(21.98f, 10.55f, 21.08f, 9.35f, 19.58f, 9.35f)
                horizontalLineTo(15.58f)
                curveTo(14.98f, 9.35f, 14.48f, 8.85f, 14.58f, 8.15f)
                lineTo(15.08f, 4.95f)
                curveTo(15.28f, 4.05f, 14.68f, 3.05f, 13.78f, 2.75f)
                curveTo(12.98f, 2.45f, 11.98f, 2.85f, 11.58f, 3.45f)
                lineTo(7.48f, 9.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.38f, 18.35f)
                verticalLineTo(8.55f)
                curveTo(2.38f, 7.15f, 2.98f, 6.65f, 4.38f, 6.65f)
                horizontalLineTo(5.38f)
                curveTo(6.78f, 6.65f, 7.38f, 7.15f, 7.38f, 8.55f)
                verticalLineTo(18.35f)
                curveTo(7.38f, 19.75f, 6.78f, 20.25f, 5.38f, 20.25f)
                horizontalLineTo(4.38f)
                curveTo(2.98f, 20.25f, 2.38f, 19.75f, 2.38f, 18.35f)
                close()
            }
        }
        .build()
        return _like1!!
    }

private var _like1: ImageVector? = null
