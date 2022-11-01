package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.4f, 2.0f)
                curveTo(15.6f, 3.1f, 15.1f, 4.2f, 14.5f, 5.0f)
                curveTo(13.9f, 5.8f, 12.8f, 6.5f, 11.7f, 6.4f)
                curveTo(11.5f, 5.3f, 12.0f, 4.3f, 12.6f, 3.5f)
                curveTo(13.3f, 2.7f, 14.4f, 2.1f, 15.4f, 2.0f)
                close()
                moveTo(18.6f, 19.4f)
                curveTo(19.1f, 18.6f, 19.4f, 18.1f, 19.8f, 17.2f)
                curveTo(16.7f, 16.0f, 16.2f, 11.6f, 19.3f, 10.0f)
                curveTo(18.4f, 8.8f, 17.1f, 8.2f, 15.8f, 8.2f)
                curveTo(14.9f, 8.2f, 14.3f, 8.4f, 13.7f, 8.6f)
                curveTo(13.2f, 8.8f, 12.8f, 8.9f, 12.3f, 8.9f)
                curveTo(11.7f, 8.9f, 11.3f, 8.7f, 10.7f, 8.5f)
                curveTo(10.1f, 8.3f, 9.5f, 8.1f, 8.8f, 8.1f)
                curveTo(7.4f, 8.1f, 5.9f, 8.9f, 5.0f, 10.4f)
                curveTo(3.7f, 12.4f, 3.9f, 16.3f, 6.0f, 19.5f)
                curveTo(6.9f, 20.7f, 7.9f, 22.0f, 9.2f, 22.0f)
                curveTo(9.8f, 22.0f, 10.1f, 21.8f, 10.5f, 21.7f)
                curveTo(11.0f, 21.5f, 11.5f, 21.3f, 12.3f, 21.3f)
                curveTo(13.2f, 21.3f, 13.6f, 21.5f, 14.1f, 21.7f)
                curveTo(14.5f, 21.9f, 14.8f, 22.0f, 15.4f, 22.0f)
                curveTo(16.8f, 22.0f, 17.8f, 20.5f, 18.6f, 19.4f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
