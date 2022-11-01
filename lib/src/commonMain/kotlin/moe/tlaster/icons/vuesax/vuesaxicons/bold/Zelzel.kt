package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Zelzel: ImageVector
    get() {
        if (_zelzel != null) {
            return _zelzel!!
        }
        _zelzel = Builder(name = "Zelzel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.5f, 14.02f)
                curveTo(18.5f, 14.2f, 18.4f, 14.36f, 18.25f, 14.45f)
                lineTo(16.25f, 15.6f)
                curveTo(16.1f, 15.69f, 15.91f, 15.69f, 15.75f, 15.6f)
                lineTo(13.75f, 14.45f)
                curveTo(13.59f, 14.36f, 13.5f, 14.2f, 13.5f, 14.02f)
                verticalLineTo(13.19f)
                lineTo(12.25f, 13.91f)
                curveTo(12.1f, 14.0f, 11.91f, 14.0f, 11.75f, 13.91f)
                lineTo(10.5f, 13.19f)
                verticalLineTo(14.02f)
                curveTo(10.5f, 14.2f, 10.4f, 14.36f, 10.25f, 14.45f)
                lineTo(8.25f, 15.6f)
                curveTo(8.1f, 15.69f, 7.91f, 15.69f, 7.75f, 15.6f)
                lineTo(5.75f, 14.45f)
                curveTo(5.59f, 14.36f, 5.5f, 14.2f, 5.5f, 14.02f)
                verticalLineTo(11.74f)
                curveTo(5.5f, 11.56f, 5.6f, 11.4f, 5.75f, 11.31f)
                lineTo(7.75f, 10.16f)
                curveTo(7.9f, 10.07f, 8.1f, 10.07f, 8.25f, 10.16f)
                lineTo(9.25f, 10.74f)
                verticalLineTo(9.61f)
                curveTo(9.25f, 9.43f, 9.35f, 9.27f, 9.5f, 9.18f)
                lineTo(11.75f, 7.89f)
                curveTo(11.9f, 7.8f, 12.09f, 7.8f, 12.25f, 7.89f)
                lineTo(14.5f, 9.18f)
                curveTo(14.66f, 9.27f, 14.75f, 9.43f, 14.75f, 9.61f)
                verticalLineTo(10.74f)
                lineTo(15.75f, 10.16f)
                curveTo(15.9f, 10.07f, 16.09f, 10.07f, 16.25f, 10.16f)
                lineTo(18.25f, 11.31f)
                curveTo(18.41f, 11.4f, 18.5f, 11.56f, 18.5f, 11.74f)
                verticalLineTo(14.02f)
                close()
            }
        }
        .build()
        return _zelzel!!
    }

private var _zelzel: ImageVector? = null
