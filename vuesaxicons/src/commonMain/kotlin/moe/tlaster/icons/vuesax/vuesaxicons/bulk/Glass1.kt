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

public val BulkGroup.Glass1: ImageVector
    get() {
        if (_glass1 != null) {
            return _glass1!!
        }
        _glass1 = Builder(name = "Glass1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8406f, 22.0002f)
                horizontalLineTo(8.1606f)
                curveTo(3.9706f, 22.0002f, 3.1406f, 19.4702f, 4.5006f, 16.3902f)
                lineTo(5.9406f, 13.1202f)
                curveTo(5.9406f, 13.1202f, 9.0006f, 13.0002f, 12.0006f, 14.0002f)
                curveTo(15.0006f, 15.0002f, 17.8306f, 13.1102f, 17.8306f, 13.1102f)
                lineTo(18.0206f, 12.9902f)
                lineTo(19.5106f, 16.4002f)
                curveTo(20.8506f, 19.4802f, 19.9706f, 22.0002f, 15.8406f, 22.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0195f, 12.99f)
                lineTo(17.8295f, 13.11f)
                curveTo(17.8295f, 13.11f, 14.9995f, 15.0f, 11.9995f, 14.0f)
                curveTo(8.9994f, 13.0f, 5.9394f, 13.12f, 5.9394f, 13.12f)
                lineTo(8.7395f, 6.74f)
                horizontalLineTo(8.4395f)
                curveTo(7.7895f, 6.74f, 7.1894f, 6.48f, 6.7594f, 6.05f)
                curveTo(6.3295f, 5.62f, 6.0694f, 5.02f, 6.0694f, 4.37f)
                curveTo(6.0694f, 3.07f, 7.1294f, 2.0f, 8.4395f, 2.0f)
                horizontalLineTo(15.5495f)
                curveTo(16.2095f, 2.0f, 16.7995f, 2.27f, 17.2295f, 2.7f)
                curveTo(17.7895f, 3.26f, 18.0795f, 4.08f, 17.8595f, 4.95f)
                curveTo(17.5995f, 6.03f, 16.5595f, 6.74f, 15.4395f, 6.74f)
                horizontalLineTo(15.2795f)
                lineTo(18.0195f, 12.99f)
                close()
            }
        }
        .build()
        return _glass1!!
    }

private var _glass1: ImageVector? = null
