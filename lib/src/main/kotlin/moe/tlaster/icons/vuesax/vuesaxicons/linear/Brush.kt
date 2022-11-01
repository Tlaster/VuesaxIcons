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

public val LinearGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                curveTo(10.0f, 14.34f, 10.0f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 13.0f, 20.0f, 12.0f, 20.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 6.0f, 20.0f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(7.35f, 3.95f, 7.35f, 6.05f, 8.0f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(12.65f, 6.05f, 12.65f, 3.95f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.0f, 2.0f, 4.0f, 3.0f, 4.0f, 5.0f)
                curveTo(4.0f, 7.0f, 5.0f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0f, 6.0f, 7.0f, 4.0f, 8.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(13.0f, 4.0f, 13.0f, 6.0f, 12.0f, 8.0f)
                horizontalLineTo(13.0f)
                curveTo(15.0f, 8.0f, 16.0f, 7.0f, 16.0f, 5.0f)
                curveTo(16.0f, 3.0f, 15.0f, 2.0f, 13.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 22.0f)
                horizontalLineTo(10.5f)
                curveTo(12.0f, 22.0f, 12.0f, 21.0f, 12.0f, 20.5f)
                verticalLineTo(17.5f)
                curveTo(12.0f, 17.0f, 12.0f, 16.0f, 10.5f, 16.0f)
                horizontalLineTo(9.5f)
                curveTo(8.0f, 16.0f, 8.0f, 17.0f, 8.0f, 17.5f)
                verticalLineTo(20.5f)
                curveTo(8.0f, 21.0f, 8.0f, 22.0f, 9.5f, 22.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
