package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Js: ImageVector
    get() {
        if (_js != null) {
            return _js!!
        }
        _js = Builder(name = "Js", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.9999f)
                verticalLineTo(16.8999f)
                curveTo(9.0f, 18.3999f, 7.4f, 19.3999f, 6.0f, 18.5999f)
                lineTo(3.5f, 17.1999f)
                curveTo(3.2f, 17.0999f, 3.0f, 16.7999f, 3.0f, 16.3999f)
                verticalLineTo(7.5999f)
                curveTo(3.0f, 7.1999f, 3.2f, 6.8999f, 3.5f, 6.6999f)
                lineTo(11.5f, 2.2999f)
                curveTo(11.8f, 2.0999f, 12.2f, 2.0999f, 12.5f, 2.2999f)
                lineTo(20.5f, 6.6999f)
                curveTo(20.8f, 6.8999f, 21.0f, 7.1999f, 21.0f, 7.5999f)
                verticalLineTo(16.3999f)
                curveTo(21.0f, 16.7999f, 20.8f, 17.0999f, 20.5f, 17.2999f)
                lineTo(12.5f, 21.6999f)
                curveTo(12.2f, 21.8999f, 11.8f, 21.8999f, 11.5f, 21.6999f)
                lineTo(10.0f, 20.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9998f, 10.8f)
                curveTo(16.9998f, 9.8f, 16.1998f, 9.0f, 15.2998f, 9.0f)
                horizontalLineTo(13.4998f)
                curveTo(12.4998f, 9.0f, 11.7998f, 9.8f, 11.7998f, 10.7f)
                curveTo(11.7998f, 11.7f, 12.5998f, 12.4f, 13.4998f, 12.4f)
                horizontalLineTo(15.2998f)
                curveTo(16.2998f, 12.4f, 16.9998f, 13.2f, 16.9998f, 14.1f)
                curveTo(16.9998f, 15.1f, 16.1998f, 15.8f, 15.2998f, 15.8f)
                horizontalLineTo(13.4998f)
                curveTo(12.4998f, 15.8f, 11.7998f, 15.0f, 11.7998f, 14.1f)
            }
        }
        .build()
        return _js!!
    }

private var _js: ImageVector? = null
