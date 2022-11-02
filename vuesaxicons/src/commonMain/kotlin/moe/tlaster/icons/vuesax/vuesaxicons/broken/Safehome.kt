package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Safehome: ImageVector
    get() {
        if (_safehome != null) {
            return _safehome!!
        }
        _safehome = Builder(name = "Safehome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.9998f, 17.5601f)
                verticalLineTo(15.37f)
                curveTo(22.9998f, 14.95f, 22.6898f, 14.49f, 22.3098f, 14.33f)
                lineTo(20.5198f, 13.6f)
                lineTo(19.5198f, 13.1899f)
                curveTo(18.8898f, 12.9399f, 18.1898f, 12.9399f, 17.5598f, 13.1899f)
                lineTo(14.7798f, 14.33f)
                curveTo(14.3998f, 14.49f, 14.0898f, 14.95f, 14.0898f, 15.37f)
                verticalLineTo(17.5601f)
                curveTo(14.0898f, 18.8101f, 14.5498f, 20.02f, 15.3398f, 21.0f)
                curveTo(16.0698f, 21.93f, 17.1099f, 22.65f, 18.2899f, 22.97f)
                curveTo(18.4499f, 23.01f, 18.6298f, 23.01f, 18.7998f, 22.97f)
                curveTo(19.7898f, 22.7f, 20.6698f, 22.1499f, 21.3598f, 21.4399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0293f, 11.0101f)
                curveTo(1.8693f, 10.0801f, 2.3393f, 8.83f, 3.0793f, 8.24f)
                lineTo(9.6593f, 2.98f)
                curveTo(10.6693f, 2.17f, 12.3093f, 2.17f, 13.3193f, 2.99f)
                lineTo(19.8993f, 8.24f)
                curveTo(20.6293f, 8.83f, 21.1093f, 10.0801f, 20.9493f, 11.0101f)
                lineTo(20.5193f, 13.6f)
                lineTo(19.5193f, 13.19f)
                curveTo(18.8893f, 12.94f, 18.1893f, 12.94f, 17.5593f, 13.19f)
                lineTo(14.7793f, 14.33f)
                curveTo(14.3993f, 14.49f, 14.0893f, 14.95f, 14.0893f, 15.37f)
                verticalLineTo(17.5601f)
                curveTo(14.0893f, 18.8101f, 14.5493f, 20.02f, 15.3393f, 21.0f)
                horizontalLineTo(6.1793f)
                curveTo(4.8093f, 21.0f, 3.5193f, 19.9101f, 3.2893f, 18.5601f)
                lineTo(2.7393f, 15.24f)
            }
        }
        .build()
        return _safehome!!
    }

private var _safehome: ImageVector? = null
