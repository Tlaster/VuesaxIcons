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

public val OutlineGroup.Videocircle: ImageVector
    get() {
        if (_videocircle != null) {
            return _videocircle!!
        }
        _videocircle = Builder(name = "Videocircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7598f, 16.3698f)
                curveTo(10.3398f, 16.3698f, 9.9498f, 16.2698f, 9.5998f, 16.0698f)
                curveTo(8.7998f, 15.6098f, 8.3398f, 14.6698f, 8.3398f, 13.4798f)
                verticalLineTo(10.5198f)
                curveTo(8.3398f, 9.3398f, 8.7998f, 8.3898f, 9.5998f, 7.9298f)
                curveTo(10.3998f, 7.4698f, 11.4398f, 7.5398f, 12.4698f, 8.1398f)
                lineTo(15.0398f, 9.6198f)
                curveTo(16.0598f, 10.2098f, 16.6498f, 11.0798f, 16.6498f, 11.9998f)
                curveTo(16.6498f, 12.9198f, 16.0598f, 13.7898f, 15.0398f, 14.3798f)
                lineTo(12.4698f, 15.8598f)
                curveTo(11.8898f, 16.1998f, 11.2998f, 16.3698f, 10.7598f, 16.3698f)
                close()
                moveTo(10.7698f, 9.1298f)
                curveTo(10.6098f, 9.1298f, 10.4698f, 9.1598f, 10.3598f, 9.2298f)
                curveTo(10.0398f, 9.4198f, 9.8498f, 9.8898f, 9.8498f, 10.5198f)
                verticalLineTo(13.4798f)
                curveTo(9.8498f, 14.1098f, 10.0298f, 14.5798f, 10.3598f, 14.7698f)
                curveTo(10.6798f, 14.9598f, 11.1798f, 14.8798f, 11.7298f, 14.5598f)
                lineTo(14.2998f, 13.0798f)
                curveTo(14.8498f, 12.7598f, 15.1598f, 12.3698f, 15.1598f, 11.9998f)
                curveTo(15.1598f, 11.6298f, 14.8498f, 11.2298f, 14.2998f, 10.9198f)
                lineTo(11.7298f, 9.4398f)
                curveTo(11.3698f, 9.2298f, 11.0398f, 9.1298f, 10.7698f, 9.1298f)
                close()
            }
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
        }
        .build()
        return _videocircle!!
    }

private var _videocircle: ImageVector? = null
