package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1001f, 2.0f)
                horizontalLineTo(19.9001f)
                curveTo(20.5001f, 2.0f, 21.0001f, 2.5f, 20.9001f, 3.1f)
                lineTo(19.1001f, 19.3f)
                curveTo(19.1001f, 19.7f, 18.8001f, 20.0f, 18.4001f, 20.2f)
                lineTo(12.3001f, 21.9f)
                curveTo(12.1001f, 22.0f, 11.9001f, 22.0f, 11.8001f, 21.9f)
                lineTo(5.7001f, 20.2f)
                curveTo(5.3001f, 20.1f, 5.0001f, 19.8f, 5.0001f, 19.3f)
                lineTo(3.1001f, 3.1f)
                curveTo(3.1001f, 2.5f, 3.5001f, 2.0f, 4.1001f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1998f, 6.8f)
                horizontalLineTo(7.7998f)
                lineTo(8.1998f, 11.2f)
                horizontalLineTo(15.7998f)
                lineTo(15.1998f, 16.2f)
                lineTo(11.7998f, 17.2f)
                lineTo(8.1998f, 16.2f)
                verticalLineTo(14.2f)
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
