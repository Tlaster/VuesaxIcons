package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BoldGroup

public val BoldGroup.Maker: ImageVector
    get() {
        if (_maker != null) {
            return _maker!!
        }
        _maker = Builder(name = "Maker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.5f, 14.5f)
                curveTo(11.5f, 14.91f, 11.16f, 15.25f, 10.75f, 15.25f)
                curveTo(10.34f, 15.25f, 10.0f, 14.91f, 10.0f, 14.5f)
                verticalLineTo(12.42f)
                lineTo(7.33f, 10.82f)
                verticalLineTo(14.5f)
                curveTo(7.33f, 14.91f, 6.99f, 15.25f, 6.58f, 15.25f)
                curveTo(6.17f, 15.25f, 5.83f, 14.91f, 5.83f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(5.83f, 9.23f, 5.98f, 8.98f, 6.21f, 8.85f)
                curveTo(6.44f, 8.72f, 6.73f, 8.72f, 6.96f, 8.86f)
                lineTo(11.13f, 11.36f)
                curveTo(11.36f, 11.5f, 11.49f, 11.74f, 11.49f, 12.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.5f)
                close()
                moveTo(18.17f, 14.5f)
                curveTo(18.17f, 14.91f, 17.83f, 15.25f, 17.42f, 15.25f)
                curveTo(17.01f, 15.25f, 16.67f, 14.91f, 16.67f, 14.5f)
                verticalLineTo(10.82f)
                lineTo(14.0f, 12.42f)
                verticalLineTo(14.5f)
                curveTo(14.0f, 14.91f, 13.66f, 15.25f, 13.25f, 15.25f)
                curveTo(12.84f, 15.25f, 12.5f, 14.91f, 12.5f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(12.5f, 11.74f, 12.64f, 11.49f, 12.86f, 11.36f)
                lineTo(17.03f, 8.86f)
                curveTo(17.26f, 8.72f, 17.55f, 8.72f, 17.78f, 8.85f)
                curveTo(18.02f, 8.98f, 18.16f, 9.23f, 18.16f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(18.17f)
                close()
            }
        }
        .build()
        return _maker!!
    }

private var _maker: ImageVector? = null
