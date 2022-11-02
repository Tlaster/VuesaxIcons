package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.2692f, 7.51f)
                curveTo(2.5892f, 8.87f, 2.1992f, 10.39f, 2.1992f, 12.0f)
                curveTo(2.1992f, 13.61f, 2.5892f, 15.13f, 3.2692f, 16.49f)
                lineTo(3.2792f, 16.48f)
                verticalLineTo(16.49f)
                curveTo(4.9192f, 19.76f, 8.2892f, 22.0f, 12.1992f, 22.0f)
                curveTo(14.8992f, 22.0f, 17.1692f, 21.11f, 18.8192f, 19.58f)
                curveTo(20.7092f, 17.84f, 21.7992f, 15.27f, 21.7992f, 12.22f)
                curveTo(21.7992f, 11.4f, 21.7292f, 10.8f, 21.5892f, 10.18f)
                horizontalLineTo(12.1992f)
                verticalLineTo(13.89f)
                horizontalLineTo(17.7092f)
                curveTo(17.5992f, 14.81f, 16.9992f, 16.2f, 15.6692f, 17.13f)
                curveTo(14.8292f, 17.72f, 13.6892f, 18.13f, 12.1992f, 18.13f)
                curveTo(9.5592f, 18.13f, 7.3092f, 16.39f, 6.5092f, 13.97f)
                curveTo(6.2992f, 13.35f, 6.1792f, 12.68f, 6.1792f, 11.99f)
                curveTo(6.1792f, 11.3f, 6.2992f, 10.63f, 6.4992f, 10.01f)
                curveTo(6.5592f, 9.83f, 6.6292f, 9.64f, 6.7092f, 9.47f)
                curveTo(7.6592f, 7.34f, 9.7592f, 5.86f, 12.1992f, 5.86f)
                curveTo(14.0792f, 5.86f, 15.3392f, 6.67f, 16.0692f, 7.35f)
                lineTo(18.8892f, 4.59f)
                curveTo(17.1592f, 2.98f, 14.8992f, 1.99f, 12.1992f, 1.99f)
                curveTo(10.0492f, 1.99f, 8.0592f, 2.67f, 6.4292f, 3.82f)
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
