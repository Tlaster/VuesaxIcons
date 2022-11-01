package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Rulerpen: ImageVector
    get() {
        if (_rulerpen != null) {
            return _rulerpen!!
        }
        _rulerpen = Builder(name = "Rulerpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4707f, 2.0f)
                curveTo(12.4707f, 2.0f, 11.4707f, 3.0f, 11.4707f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(11.4707f, 21.0f, 12.4707f, 22.0f, 14.4707f, 22.0f)
                horizontalLineTo(18.4707f)
                curveTo(20.4707f, 22.0f, 21.4707f, 21.0f, 21.4707f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.4707f, 3.0f, 20.4707f, 2.0f, 18.4707f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4707f, 6.0f)
                horizontalLineTo(16.4707f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4707f, 18.0f)
                horizontalLineTo(15.4707f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4707f, 13.95f)
                lineTo(16.4707f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4707f, 10.0f)
                horizontalLineTo(14.4707f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5293f, 9.02f)
                verticalLineTo(4.95f)
                curveTo(2.5293f, 3.33f, 3.8593f, 2.0f, 5.4893f, 2.0f)
                curveTo(7.1093f, 2.0f, 8.4393f, 3.33f, 8.4393f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(8.4393f, 18.36f, 8.2493f, 19.04f, 8.0193f, 19.43f)
                lineTo(7.1993f, 20.79f)
                curveTo(6.2593f, 22.36f, 4.7093f, 22.36f, 3.7693f, 20.79f)
                lineTo(2.9493f, 19.43f)
                curveTo(2.7193f, 19.04f, 2.5293f, 18.36f, 2.5293f, 17.91f)
                verticalLineTo(13.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4393f, 7.0f)
                horizontalLineTo(2.5293f)
            }
        }
        .build()
        return _rulerpen!!
    }

private var _rulerpen: ImageVector? = null
