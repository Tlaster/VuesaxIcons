package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6f, 10.2f)
                horizontalLineTo(12.2f)
                verticalLineTo(13.9f)
                horizontalLineTo(17.7f)
                curveTo(17.6f, 14.8f, 17.0f, 16.2f, 15.7f, 17.1f)
                curveTo(14.9f, 17.7f, 13.7f, 18.1f, 12.2f, 18.1f)
                curveTo(9.5999f, 18.1f, 7.3f, 16.4f, 6.4999f, 13.9f)
                curveTo(6.3f, 13.3f, 6.2f, 12.6f, 6.2f, 11.9f)
                curveTo(6.2f, 11.2f, 6.3f, 10.5f, 6.4999f, 9.9f)
                curveTo(6.5999f, 9.7f, 6.5999f, 9.5f, 6.7f, 9.4f)
                curveTo(7.5999f, 7.3f, 9.7f, 5.8f, 12.2f, 5.8f)
                curveTo(14.1f, 5.8f, 15.3f, 6.6f, 16.1f, 7.3f)
                lineTo(18.9f, 4.5f)
                curveTo(17.1999f, 3.0f, 14.9f, 2.0f, 12.2f, 2.0f)
                curveTo(8.2999f, 2.0f, 4.9f, 4.2f, 3.2999f, 7.5f)
                curveTo(2.6f, 8.9f, 2.1999f, 10.4f, 2.1999f, 12.0f)
                curveTo(2.1999f, 13.6f, 2.6f, 15.1f, 3.2999f, 16.5f)
                curveTo(4.9f, 19.8f, 8.2999f, 22.0f, 12.2f, 22.0f)
                curveTo(14.9f, 22.0f, 17.1999f, 21.1f, 18.7999f, 19.6f)
                curveTo(20.6999f, 17.9f, 21.7999f, 15.3f, 21.7999f, 12.2f)
                curveTo(21.7999f, 11.4f, 21.7f, 10.8f, 21.6f, 10.2f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
