package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowdown2: ImageVector
    get() {
        if (_arrowdown2 != null) {
            return _arrowdown2!!
        }
        _arrowdown2 = Builder(name = "Arrowdown2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.25f)
                curveTo(11.59f, 15.25f, 11.25f, 14.91f, 11.25f, 14.5f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12.0f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.91f, 12.41f, 15.25f, 12.0f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 16.2499f)
                curveTo(11.8095f, 16.2499f, 11.6195f, 16.1799f, 11.4695f, 16.0299f)
                lineTo(8.4694f, 13.0299f)
                curveTo(8.1795f, 12.7399f, 8.1795f, 12.2599f, 8.4694f, 11.9699f)
                curveTo(8.7594f, 11.6799f, 9.2395f, 11.6799f, 9.5295f, 11.9699f)
                lineTo(11.9995f, 14.4399f)
                lineTo(14.4695f, 11.9699f)
                curveTo(14.7595f, 11.6799f, 15.2395f, 11.6799f, 15.5295f, 11.9699f)
                curveTo(15.8195f, 12.2599f, 15.8195f, 12.7399f, 15.5295f, 13.0299f)
                lineTo(12.5295f, 16.0299f)
                curveTo(12.3795f, 16.1799f, 12.1895f, 16.2499f, 11.9995f, 16.2499f)
                close()
            }
        }
        .build()
        return _arrowdown2!!
    }

private var _arrowdown2: ImageVector? = null
