package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Reserve: ImageVector
    get() {
        if (_reserve != null) {
            return _reserve!!
        }
        _reserve = Builder(name = "Reserve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.97f, 22.0f)
                horizontalLineTo(4.97f)
                curveTo(1.97f, 22.0f, 1.97f, 20.65f, 1.97f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(1.97f, 17.45f, 2.42f, 17.0f, 2.97f, 17.0f)
                horizontalLineTo(20.97f)
                curveTo(21.52f, 17.0f, 21.97f, 17.45f, 21.97f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(21.97f, 20.65f, 21.97f, 22.0f, 18.97f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.72f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.27f)
                verticalLineTo(13.0f)
                curveTo(3.27f, 9.16f, 5.98f, 5.95f, 9.59f, 5.18f)
                curveTo(10.13f, 5.06f, 10.69f, 5.0f, 11.27f, 5.0f)
                horizontalLineTo(12.72f)
                curveTo(13.3f, 5.0f, 13.87f, 5.06f, 14.41f, 5.18f)
                curveTo(18.02f, 5.96f, 20.72f, 9.16f, 20.72f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                curveTo(14.5f, 4.74f, 14.47f, 4.96f, 14.41f, 5.18f)
                curveTo(13.87f, 5.06f, 13.3f, 5.0f, 12.72f, 5.0f)
                horizontalLineTo(11.27f)
                curveTo(10.69f, 5.0f, 10.13f, 5.06f, 9.59f, 5.18f)
                curveTo(9.53f, 4.96f, 9.5f, 4.74f, 9.5f, 4.5f)
                curveTo(9.5f, 3.12f, 10.62f, 2.0f, 12.0f, 2.0f)
                curveTo(13.38f, 2.0f, 14.5f, 3.12f, 14.5f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                horizontalLineTo(9.0f)
            }
        }
        .build()
        return _reserve!!
    }

private var _reserve: ImageVector? = null
