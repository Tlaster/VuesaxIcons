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

public val BulkGroup.Audiosquare: ImageVector
    get() {
        if (_audiosquare != null) {
            return _audiosquare!!
        }
        _audiosquare = Builder(name = "Audiosquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6191f, 7.1f)
                lineTo(13.3292f, 6.34f)
                curveTo(12.7492f, 6.14f, 12.1592f, 6.22f, 11.7092f, 6.54f)
                curveTo(11.2592f, 6.86f, 11.0092f, 7.4f, 11.0092f, 8.01f)
                verticalLineTo(8.62f)
                verticalLineTo(12.8f)
                curveTo(10.6092f, 12.58f, 10.1591f, 12.45f, 9.6691f, 12.45f)
                curveTo(8.1291f, 12.45f, 6.8691f, 13.71f, 6.8691f, 15.25f)
                curveTo(6.8691f, 16.79f, 8.1291f, 18.05f, 9.6691f, 18.05f)
                curveTo(11.2091f, 18.05f, 12.4691f, 16.79f, 12.4691f, 15.25f)
                verticalLineTo(10.7f)
                curveTo(12.4791f, 10.71f, 12.4992f, 10.71f, 12.5092f, 10.72f)
                lineTo(14.7991f, 11.48f)
                curveTo(15.0091f, 11.55f, 15.2291f, 11.59f, 15.4391f, 11.59f)
                curveTo(15.7991f, 11.59f, 16.1391f, 11.49f, 16.4191f, 11.28f)
                curveTo(16.8691f, 10.96f, 17.1191f, 10.42f, 17.1191f, 9.81f)
                verticalLineTo(9.2f)
                curveTo(17.1191f, 8.29f, 16.4791f, 7.39f, 15.6191f, 7.1f)
                close()
                moveTo(9.6691f, 16.59f)
                curveTo(8.9291f, 16.59f, 8.3392f, 15.99f, 8.3392f, 15.26f)
                curveTo(8.3392f, 14.52f, 8.9391f, 13.92f, 9.6691f, 13.92f)
                curveTo(10.4091f, 13.92f, 11.0092f, 14.52f, 11.0092f, 15.26f)
                curveTo(11.0092f, 15.99f, 10.4091f, 16.59f, 9.6691f, 16.59f)
                close()
            }
        }
        .build()
        return _audiosquare!!
    }

private var _audiosquare: ImageVector? = null
