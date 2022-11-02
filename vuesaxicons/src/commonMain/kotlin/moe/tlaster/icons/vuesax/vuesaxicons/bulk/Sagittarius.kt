package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Sagittarius: ImageVector
    get() {
        if (_sagittarius != null) {
            return _sagittarius!!
        }
        _sagittarius = Builder(name = "Sagittarius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6897f, 2.71f)
                curveTo(21.6097f, 2.53f, 21.4697f, 2.38f, 21.2797f, 2.3f)
                curveTo(21.1897f, 2.26f, 21.0897f, 2.24f, 20.9897f, 2.24f)
                horizontalLineTo(11.9897f)
                curveTo(11.5797f, 2.24f, 11.2397f, 2.58f, 11.2397f, 2.99f)
                curveTo(11.2397f, 3.4f, 11.5797f, 3.74f, 11.9897f, 3.74f)
                horizontalLineTo(19.1797f)
                lineTo(2.4597f, 20.46f)
                curveTo(2.1697f, 20.75f, 2.1697f, 21.23f, 2.4597f, 21.52f)
                curveTo(2.6097f, 21.67f, 2.7997f, 21.74f, 2.9897f, 21.74f)
                curveTo(3.1797f, 21.74f, 3.3697f, 21.67f, 3.5197f, 21.52f)
                lineTo(20.2397f, 4.8f)
                verticalLineTo(12.0f)
                curveTo(20.2397f, 12.41f, 20.5797f, 12.75f, 20.9897f, 12.75f)
                curveTo(21.3997f, 12.75f, 21.7397f, 12.41f, 21.7397f, 12.0f)
                verticalLineTo(3.0f)
                curveTo(21.7497f, 2.9f, 21.7297f, 2.81f, 21.6897f, 2.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.3991f, 18.1501f)
                curveTo(17.2091f, 18.1501f, 17.019f, 18.08f, 16.8691f, 17.93f)
                lineTo(6.0691f, 7.13f)
                curveTo(5.7791f, 6.84f, 5.7791f, 6.36f, 6.0691f, 6.07f)
                curveTo(6.3591f, 5.78f, 6.8391f, 5.78f, 7.1291f, 6.07f)
                lineTo(17.929f, 16.87f)
                curveTo(18.219f, 17.16f, 18.219f, 17.64f, 17.929f, 17.93f)
                curveTo(17.779f, 18.08f, 17.5891f, 18.1501f, 17.3991f, 18.1501f)
                close()
            }
        }
        .build()
        return _sagittarius!!
    }

private var _sagittarius: ImageVector? = null
