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

public val OutlineGroup.Sagittarius: ImageVector
    get() {
        if (_sagittarius != null) {
            return _sagittarius!!
        }
        _sagittarius = Builder(name = "Sagittarius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.75f)
                curveTo(20.59f, 12.75f, 20.25f, 12.41f, 20.25f, 12.0f)
                verticalLineTo(3.75f)
                horizontalLineTo(12.0f)
                curveTo(11.59f, 3.75f, 11.25f, 3.41f, 11.25f, 3.0f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12.0f, 2.25f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 2.25f, 21.75f, 2.59f, 21.75f, 3.0f)
                verticalLineTo(12.0f)
                curveTo(21.75f, 12.41f, 21.41f, 12.75f, 21.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9995f, 21.75f)
                curveTo(2.8095f, 21.75f, 2.6195f, 21.68f, 2.4694f, 21.53f)
                curveTo(2.1795f, 21.24f, 2.1795f, 20.7599f, 2.4694f, 20.4699f)
                lineTo(20.4695f, 2.4699f)
                curveTo(20.7595f, 2.1799f, 21.2395f, 2.1799f, 21.5295f, 2.4699f)
                curveTo(21.8195f, 2.7599f, 21.8195f, 3.24f, 21.5295f, 3.53f)
                lineTo(3.5295f, 21.53f)
                curveTo(3.3795f, 21.68f, 3.1895f, 21.75f, 2.9995f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4001f, 18.1501f)
                curveTo(17.2101f, 18.1501f, 17.02f, 18.08f, 16.87f, 17.93f)
                lineTo(6.07f, 7.13f)
                curveTo(5.78f, 6.84f, 5.78f, 6.36f, 6.07f, 6.07f)
                curveTo(6.36f, 5.78f, 6.84f, 5.78f, 7.13f, 6.07f)
                lineTo(17.93f, 16.87f)
                curveTo(18.22f, 17.16f, 18.22f, 17.64f, 17.93f, 17.93f)
                curveTo(17.78f, 18.08f, 17.5901f, 18.1501f, 17.4001f, 18.1501f)
                close()
            }
        }
        .build()
        return _sagittarius!!
    }

private var _sagittarius: ImageVector? = null
