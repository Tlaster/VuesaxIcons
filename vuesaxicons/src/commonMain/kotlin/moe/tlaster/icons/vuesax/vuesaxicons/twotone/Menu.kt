package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5401f, 8.3101f)
                curveTo(18.8987f, 8.3101f, 20.0001f, 7.2088f, 20.0001f, 5.8501f)
                curveTo(20.0001f, 4.4915f, 18.8987f, 3.3901f, 17.5401f, 3.3901f)
                curveTo(16.1814f, 3.3901f, 15.0801f, 4.4915f, 15.0801f, 5.8501f)
                curveTo(15.0801f, 7.2088f, 16.1814f, 8.3101f, 17.5401f, 8.3101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.46f, 8.3101f)
                curveTo(7.8186f, 8.3101f, 8.92f, 7.2088f, 8.92f, 5.8501f)
                curveTo(8.92f, 4.4915f, 7.8186f, 3.3901f, 6.46f, 3.3901f)
                curveTo(5.1014f, 3.3901f, 4.0f, 4.4915f, 4.0f, 5.8501f)
                curveTo(4.0f, 7.2088f, 5.1014f, 8.3101f, 6.46f, 8.3101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5401f, 20.6099f)
                curveTo(18.8987f, 20.6099f, 20.0001f, 19.5086f, 20.0001f, 18.1499f)
                curveTo(20.0001f, 16.7913f, 18.8987f, 15.6899f, 17.5401f, 15.6899f)
                curveTo(16.1814f, 15.6899f, 15.0801f, 16.7913f, 15.0801f, 18.1499f)
                curveTo(15.0801f, 19.5086f, 16.1814f, 20.6099f, 17.5401f, 20.6099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.46f, 20.6099f)
                curveTo(7.8186f, 20.6099f, 8.92f, 19.5086f, 8.92f, 18.1499f)
                curveTo(8.92f, 16.7913f, 7.8186f, 15.6899f, 6.46f, 15.6899f)
                curveTo(5.1014f, 15.6899f, 4.0f, 16.7913f, 4.0f, 18.1499f)
                curveTo(4.0f, 19.5086f, 5.1014f, 20.6099f, 6.46f, 20.6099f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
