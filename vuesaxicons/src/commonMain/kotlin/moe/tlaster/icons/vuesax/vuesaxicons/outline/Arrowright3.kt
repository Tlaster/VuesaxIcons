package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowright3: ImageVector
    get() {
        if (_arrowright3 != null) {
            return _arrowright3!!
        }
        _arrowright3 = Builder(name = "Arrowright3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9096f, 20.67f)
                curveTo(8.7196f, 20.67f, 8.5296f, 20.6f, 8.3796f, 20.45f)
                curveTo(8.0896f, 20.16f, 8.0896f, 19.68f, 8.3796f, 19.39f)
                lineTo(14.8996f, 12.87f)
                curveTo(15.3796f, 12.39f, 15.3796f, 11.61f, 14.8996f, 11.13f)
                lineTo(8.3796f, 4.61f)
                curveTo(8.0896f, 4.32f, 8.0896f, 3.84f, 8.3796f, 3.55f)
                curveTo(8.6696f, 3.26f, 9.1496f, 3.26f, 9.4396f, 3.55f)
                lineTo(15.9596f, 10.07f)
                curveTo(16.4696f, 10.58f, 16.7596f, 11.27f, 16.7596f, 12.0f)
                curveTo(16.7596f, 12.73f, 16.4796f, 13.42f, 15.9596f, 13.93f)
                lineTo(9.4396f, 20.45f)
                curveTo(9.2896f, 20.59f, 9.0996f, 20.67f, 8.9096f, 20.67f)
                close()
            }
        }
        .build()
        return _arrowright3!!
    }

private var _arrowright3: ImageVector? = null
